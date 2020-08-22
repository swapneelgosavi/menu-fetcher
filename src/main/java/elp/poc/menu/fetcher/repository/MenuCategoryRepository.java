package elp.poc.menu.fetcher.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import elp.poc.menu.fetcher.bean.CourseCategoryMenu;

@Repository
public class MenuCategoryRepository {

	 @Autowired
	 private JdbcTemplate jdbcTemplate;
	 
	 public CourseCategoryMenu getCourseSubCategories(int parentId) {
		 
		 String sql ="SELECT mid,menu_name, parent_mid FROM menu_category where parent_mid = ?;";
		 
		 List<CourseCategoryMenu> menuList = jdbcTemplate.query(sql, new Object[] {parentId}, new MenuCategoryRowMapper());
		 
		 CourseCategoryMenu courseCategoryMenu = new CourseCategoryMenu();
		 courseCategoryMenu.setSubMenuList(menuList);
		 courseCategoryMenu.setId(parentId);
		 
		 return courseCategoryMenu;
	 }
	 
	 //TODO
	 public CourseCategoryMenu getAllCourseCategory (int parentId) {
		 
		 String sql ="SELECT mid,menu_name, parent_mid FROM menu_category where parent_mid = ?;";
		 
		 List<CourseCategoryMenu> menuList = jdbcTemplate.query(sql, new Object[] {parentId}, new MenuCategoryRowMapper());
		 
		 CourseCategoryMenu courseCategoryMenu = new CourseCategoryMenu();
		 courseCategoryMenu.setSubMenuList(menuList);
		 courseCategoryMenu.setId(parentId);
		 
		 return courseCategoryMenu;		 
	 }
}

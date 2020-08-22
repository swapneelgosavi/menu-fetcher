package elp.poc.menu.fetcher.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import elp.poc.menu.fetcher.bean.CourseCategoryMenu;

public class MenuCategoryRowMapper implements RowMapper<CourseCategoryMenu> {

	@Override
	public CourseCategoryMenu mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		CourseCategoryMenu menu = new CourseCategoryMenu();
		menu.setId(rs.getInt("mid"));
		menu.setMenuName(rs.getString("menu_name"));
		menu.setParentId(rs.getInt("parent_mid"));
		return menu;
	}

}

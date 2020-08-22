package elp.poc.menu.fetcher.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import elp.poc.menu.fetcher.bean.CourseCategoryMenu;
import elp.poc.menu.fetcher.repository.MenuCategoryRepository;

@Service
public class CourseCategoryMenuServiceImpl implements CourseCategoryMenuService{

	@Autowired
	private MenuCategoryRepository menuCategoryRepository;
	
	@Override
	public CourseCategoryMenu getAllCourseCategory(int categoryId) {
		return menuCategoryRepository.getAllCourseCategory(categoryId);
	}

	@Override
	public CourseCategoryMenu getCourseSubCategories(int parentId) {
		return menuCategoryRepository.getCourseSubCategories(parentId);
	}

}

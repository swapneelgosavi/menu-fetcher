package elp.poc.menu.fetcher.service;

import elp.poc.menu.fetcher.bean.CourseCategoryMenu;

public interface CourseCategoryMenuService {
	
	public CourseCategoryMenu getAllCourseCategory(int categoryId);
	public CourseCategoryMenu getCourseSubCategories(int parentId);
}

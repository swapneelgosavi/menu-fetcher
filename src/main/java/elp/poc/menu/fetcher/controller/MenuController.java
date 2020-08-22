package elp.poc.menu.fetcher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import elp.poc.menu.fetcher.bean.CourseCategoryMenu;
import elp.poc.menu.fetcher.service.CourseCategoryMenuService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MenuController {

	@Autowired
	private CourseCategoryMenuService courseCategoryMenuService;
	
	@RequestMapping("/menu/{parentId}")
	public CourseCategoryMenu getCourseCategory(@PathVariable("parentId") int category_id) {
		return courseCategoryMenuService.getAllCourseCategory(category_id);
	}
	
	
	@RequestMapping("/submenu/{parentId}")
	public CourseCategoryMenu getCourseSubCategories(@PathVariable("parentId") int category_id) {
		return courseCategoryMenuService.getCourseSubCategories(category_id);
	}	
}

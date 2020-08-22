package elp.poc.menu.fetcher.bean;

import java.util.List;


public class CourseCategoryMenu {

	private int id;
	private String menuName;
	private int parentId = -1;
	private List<CourseCategoryMenu> subMenuList;
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<CourseCategoryMenu> getSubMenuList() {
		return subMenuList;
	}
	public void setSubMenuList(List<CourseCategoryMenu> subMenuList) {
		this.subMenuList = subMenuList;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "CourseCategoryMenu [id=" + id + ", menuName=" + menuName + ", parentId=" + parentId + ", subMenuList="
				+ subMenuList + "]";
	}

}

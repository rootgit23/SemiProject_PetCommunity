package com.pet.home.sell;

import java.sql.Date;

public class SellItemDTO {
	private Long itemNum;
	private String userId;
	private Long roleNum;
	private String itemName;
	private Long itemPrice;
	private String itemContents;
	private Date itemSellDate;
	private Date itemStartDate;
	private String itemEndDate;
	private Long itemLatitude;
	private Long itemLongtitude;
	private Long itemCount;
	private String itemCatg;
	public Long getItemNum() {
		return itemNum;
	}
	public void setItemNum(Long itemNum) {
		this.itemNum = itemNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getRoleNum() {
		return roleNum;
	}
	public void setRoleNum(Long roleNum) {
		this.roleNum = roleNum;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Long getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Long itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemContents() {
		return itemContents;
	}
	public void setItemContents(String itemContents) {
		this.itemContents = itemContents;
	}
	public Date getItemSellDate() {
		return itemSellDate;
	}
	public void setItemSellDate(Date itemSellDate) {
		this.itemSellDate = itemSellDate;
	}
	public Date getItemStartDate() {
		return itemStartDate;
	}
	public void setItemStartDate(Date itemStartDate) {
		this.itemStartDate = itemStartDate;
	}
	public String getItemEndDate() {
		return itemEndDate;
	}
	public void setItemEndDate(String itemEndDate) {
		this.itemEndDate = itemEndDate;
	}
	public Long getItemLatitude() {
		return itemLatitude;
	}
	public void setItemLatitude(Long itemLatitude) {
		this.itemLatitude = itemLatitude;
	}
	public Long getItemLongtitude() {
		return itemLongtitude;
	}
	public void setItemLongtitude(Long itemLongtitude) {
		this.itemLongtitude = itemLongtitude;
	}
	public Long getItemCount() {
		return itemCount;
	}
	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}
	public String getItemCatg() {
		return itemCatg;
	}
	public void setItemCatg(String itemCatg) {
		this.itemCatg = itemCatg;
	}
}

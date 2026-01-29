package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 生活服务预约单查询
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceLifeserviceBookingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1515543259799393562L;

	/**
	 * 查询预约结束日期
	 */
	@ApiField("booking_end_date")
	private String bookingEndDate;

	/**
	 * null
	 */
	@ApiListField("booking_ids")
	@ApiField("string")
	private List<String> bookingIds;

	/**
	 * 查询预约开始日期
	 */
	@ApiField("booking_start_date")
	private String bookingStartDate;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 预约人手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * null
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getBookingEndDate() {
		return this.bookingEndDate;
	}
	public void setBookingEndDate(String bookingEndDate) {
		this.bookingEndDate = bookingEndDate;
	}

	public List<String> getBookingIds() {
		return this.bookingIds;
	}
	public void setBookingIds(List<String> bookingIds) {
		this.bookingIds = bookingIds;
	}

	public String getBookingStartDate() {
		return this.bookingStartDate;
	}
	public void setBookingStartDate(String bookingStartDate) {
		this.bookingStartDate = bookingStartDate;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}

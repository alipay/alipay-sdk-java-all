package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预约信息查询
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AlipayCommerceMerchantcardBookingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8314843257613619423L;

	/**
	 * 日期
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
	@ApiField("page_no")
	private Long pageNo;

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
	 * 门店id【必填】
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 预约状态（枚举）
pending      预约待确认
confirmed    预约成功（已确认，待履约）
completed    履约完成
canceled     预约取消
expired      预约过期（未履约且超过有效期）
	 */
	@ApiField("status")
	private String status;

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

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

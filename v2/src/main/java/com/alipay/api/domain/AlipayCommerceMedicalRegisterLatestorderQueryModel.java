package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 挂号订单信息查询
 *
 * @author auto create
 * @since 1.0, 2026-07-27 10:42:52
 */
public class AlipayCommerceMedicalRegisterLatestorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8258126224566646432L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单业务参数
	 */
	@ApiField("order_prop")
	private String orderProp;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页的条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 机构ID
	 */
	@ApiField("select_hos_institution_code")
	private String selectHosInstitutionCode;

	/**
	 * 医院ID
	 */
	@ApiField("select_hos_uniq_code")
	private String selectHosUniqCode;

	/**
	 * null
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderProp() {
		return this.orderProp;
	}
	public void setOrderProp(String orderProp) {
		this.orderProp = orderProp;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getSelectHosInstitutionCode() {
		return this.selectHosInstitutionCode;
	}
	public void setSelectHosInstitutionCode(String selectHosInstitutionCode) {
		this.selectHosInstitutionCode = selectHosInstitutionCode;
	}

	public String getSelectHosUniqCode() {
		return this.selectHosUniqCode;
	}
	public void setSelectHosUniqCode(String selectHosUniqCode) {
		this.selectHosUniqCode = selectHosUniqCode;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

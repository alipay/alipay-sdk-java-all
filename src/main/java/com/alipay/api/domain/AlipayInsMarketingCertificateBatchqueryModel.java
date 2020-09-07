package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询凭证信息
 *
 * @author auto create
 * @since 1.0, 2016-10-13 19:51:03
 */
public class AlipayInsMarketingCertificateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5243895889777393265L;

	/**
	 * 32
	 */
	@ApiField("certificate_no")
	private String certificateNo;

	/**
	 * 凭证类型
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 当前页码
	 */
	@ApiField("current_page_no")
	private Long currentPageNo;

	/**
	 * 生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 是否失效
	 */
	@ApiField("is_enabled")
	private String isEnabled;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单来源
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 拥有人uid
	 */
	@ApiField("owner_uid")
	private String ownerUid;

	/**
	 * 每页记录数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 凭证状态
	 */
	@ApiField("status")
	private Long status;

	public String getCertificateNo() {
		return this.certificateNo;
	}
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public Long getCurrentPageNo() {
		return this.currentPageNo;
	}
	public void setCurrentPageNo(Long currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsEnabled() {
		return this.isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOwnerUid() {
		return this.ownerUid;
	}
	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}

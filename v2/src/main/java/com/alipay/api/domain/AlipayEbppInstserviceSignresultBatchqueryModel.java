package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣签约结果批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-20 12:12:27
 */
public class AlipayEbppInstserviceSignresultBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2496967512847456628L;

	/**
	 * 业务类型（例如通信，缴费，还款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 代扣产品码
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 机构ID（支付宝侧分配）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 级业务类型（例如话费，流量，水费，电费）
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEdeductProductCode() {
		return this.edeductProductCode;
	}
	public void setEdeductProductCode(String edeductProductCode) {
		this.edeductProductCode = edeductProductCode;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

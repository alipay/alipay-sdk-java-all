package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣签约结果接口
 *
 * @author auto create
 * @since 1.0, 2022-05-30 14:02:43
 */
public class AlipayEbppInstserviceSignresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5126522244132463496L;

	/**
	 * 户号（缴费场景是户号，话费场景是手机号）
	 */
	@ApiField("bill_key")
	private String billKey;

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
	 * 级业务类型（例如话费，流量，水费，电费）
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

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

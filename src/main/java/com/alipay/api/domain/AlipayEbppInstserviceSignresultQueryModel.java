package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务民生机构代扣签约结果接口
 *
 * @author auto create
 * @since 1.0, 2022-10-13 15:42:51
 */
public class AlipayEbppInstserviceSignresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6341799199865778497L;

	/**
	 * 户号（缴费场景是户号，话费场景是手机号）
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型。 例：通信(TX)，缴费(JF)，还款(HK)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 代扣产品码
	 */
	@ApiField("ededuct_product_code")
	private String edeductProductCode;

	/**
	 * 机构ID（接入时由支付宝技术提供）
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 二级业务类型。例：充值(CZ)，水费(WATER)，电费(ELECTRIC)
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

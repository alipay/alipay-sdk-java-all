package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次汇总对手方信息
 *
 * @author auto create
 * @since 1.0, 2024-03-06 21:11:23
 */
public class BatchDetailUserInfo extends AlipayObject {

	private static final long serialVersionUID = 7871257567128789961L;

	/**
	 * 转入方主体业务类型,待结算:unsettled,已结算:settled
	 */
	@ApiField("trans_in_entity_biz_type")
	private String transInEntityBizType;

	/**
	 * 转入方(分账对手方/结算主体)id，传具体smid;
本次支持异名结算,需要将转入方id更改为预期异名结算的smid
	 */
	@ApiField("trans_in_entity_id")
	private String transInEntityId;

	/**
	 * 转入方id类型,传smid类型,本次传4
	 */
	@ApiField("trans_in_entity_id_type")
	private String transInEntityIdType;

	/**
	 * 转出方主体业务类型,待结算:unsettled,已结算:settled
	 */
	@ApiField("trans_out_entity_biz_type")
	private String transOutEntityBizType;

	/**
	 * 转出方(分账出资方/结算主体)id,传具体smid
	 */
	@ApiField("trans_out_entity_id")
	private String transOutEntityId;

	/**
	 * 转出方id类型,传smid类型,本次传4
	 */
	@ApiField("trans_out_entity_id_type")
	private String transOutEntityIdType;

	public String getTransInEntityBizType() {
		return this.transInEntityBizType;
	}
	public void setTransInEntityBizType(String transInEntityBizType) {
		this.transInEntityBizType = transInEntityBizType;
	}

	public String getTransInEntityId() {
		return this.transInEntityId;
	}
	public void setTransInEntityId(String transInEntityId) {
		this.transInEntityId = transInEntityId;
	}

	public String getTransInEntityIdType() {
		return this.transInEntityIdType;
	}
	public void setTransInEntityIdType(String transInEntityIdType) {
		this.transInEntityIdType = transInEntityIdType;
	}

	public String getTransOutEntityBizType() {
		return this.transOutEntityBizType;
	}
	public void setTransOutEntityBizType(String transOutEntityBizType) {
		this.transOutEntityBizType = transOutEntityBizType;
	}

	public String getTransOutEntityId() {
		return this.transOutEntityId;
	}
	public void setTransOutEntityId(String transOutEntityId) {
		this.transOutEntityId = transOutEntityId;
	}

	public String getTransOutEntityIdType() {
		return this.transOutEntityIdType;
	}
	public void setTransOutEntityIdType(String transOutEntityIdType) {
		this.transOutEntityIdType = transOutEntityIdType;
	}

}

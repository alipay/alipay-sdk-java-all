package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 赠险合约保单开通
 *
 * @author auto create
 * @since 1.0, 2022-09-20 10:58:34
 */
public class AlipayInsMarketingGiftContractApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8352929721884622181L;

	/**
	 * 租客等信息
	 */
	@ApiField("biz_data_for_bx_policy")
	private String bizDataForBxPolicy;

	/**
	 * 赠险渠道，包含渠道规则等
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 合约值，外部透传，原样返回
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * entrance 运营配置入口
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 赠险产品标志
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/**
	 * 投保参数
	 */
	@ApiField("ins_apply_product_coverage_dto")
	private InsApplyProductCoverageDTO insApplyProductCoverageDto;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 和申请人关系，默认1
	 */
	@ApiField("relation_to_apply")
	private String relationToApply;

	/**
	 * 和投保人关系，5，其他
	 */
	@ApiField("relation_to_holder")
	private String relationToHolder;

	/**
	 * 赠险产品码
	 */
	@ApiField("right_no")
	private String rightNo;

	/**
	 * 运营识别来源渠道
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizDataForBxPolicy() {
		return this.bizDataForBxPolicy;
	}
	public void setBizDataForBxPolicy(String bizDataForBxPolicy) {
		this.bizDataForBxPolicy = bizDataForBxPolicy;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public String getGiftProdCode() {
		return this.giftProdCode;
	}
	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}

	public InsApplyProductCoverageDTO getInsApplyProductCoverageDto() {
		return this.insApplyProductCoverageDto;
	}
	public void setInsApplyProductCoverageDto(InsApplyProductCoverageDTO insApplyProductCoverageDto) {
		this.insApplyProductCoverageDto = insApplyProductCoverageDto;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRelationToApply() {
		return this.relationToApply;
	}
	public void setRelationToApply(String relationToApply) {
		this.relationToApply = relationToApply;
	}

	public String getRelationToHolder() {
		return this.relationToHolder;
	}
	public void setRelationToHolder(String relationToHolder) {
		this.relationToHolder = relationToHolder;
	}

	public String getRightNo() {
		return this.rightNo;
	}
	public void setRightNo(String rightNo) {
		this.rightNo = rightNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

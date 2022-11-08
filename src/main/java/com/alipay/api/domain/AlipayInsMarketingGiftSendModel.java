package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 赠险标准发放
 *
 * @author auto create
 * @since 1.0, 2022-09-20 10:57:57
 */
public class AlipayInsMarketingGiftSendModel extends AlipayObject {

	private static final long serialVersionUID = 6426562365158738333L;

	/**
	 * 渠道规则编码
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用户点击入口
	 */
	@ApiField("entrance")
	private String entrance;

	/**
	 * 是否自动领取，
true 不需要用户点击，自动到账
false 需要用户手动点击领取
	 */
	@ApiField("gain_now")
	private Boolean gainNow;

	/**
	 * 赠险产品标志
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/**
	 * 被保人uid，被保人是当前用户则选择当前user_id
	 */
	@ApiField("insured_user_id")
	private String insuredUserId;

	/**
	 * 唯一性的外部业务号，幂等单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 和申请人的关系类型，1本人
	 */
	@ApiField("relation_to_apply")
	private Long relationToApply;

	/**
	 * 赠险产品码列表
	 */
	@ApiListField("right_no_list")
	@ApiField("string")
	private List<String> rightNoList;

	/**
	 * 调用来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEntrance() {
		return this.entrance;
	}
	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}

	public Boolean getGainNow() {
		return this.gainNow;
	}
	public void setGainNow(Boolean gainNow) {
		this.gainNow = gainNow;
	}

	public String getGiftProdCode() {
		return this.giftProdCode;
	}
	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}

	public String getInsuredUserId() {
		return this.insuredUserId;
	}
	public void setInsuredUserId(String insuredUserId) {
		this.insuredUserId = insuredUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getRelationToApply() {
		return this.relationToApply;
	}
	public void setRelationToApply(Long relationToApply) {
		this.relationToApply = relationToApply;
	}

	public List<String> getRightNoList() {
		return this.rightNoList;
	}
	public void setRightNoList(List<String> rightNoList) {
		this.rightNoList = rightNoList;
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

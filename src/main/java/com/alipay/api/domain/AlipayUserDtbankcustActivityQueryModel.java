package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字分行活动列表查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-29 14:31:23
 */
public class AlipayUserDtbankcustActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2497154773992789418L;

	/**
	 * 活动类型列表：
 "FIRST_BIND_CARD_GIFT"--首绑有礼，
"DISCOUNT"--立减活动，
"VOUCHER"--渠道红包，
"MORE_USE_CARD_GIFT"--多刷有礼
	 */
	@ApiListField("activity_type_list")
	@ApiField("string")
	private List<String> activityTypeList;

	/**
	 * 卡类型
"CREDIT"--信用卡，
"DEBIT"--借记卡
	 */
	@ApiListField("bank_card_type_list")
	@ApiField("string")
	private List<String> bankCardTypeList;

	/**
	 * 银行机构号列表
	 */
	@ApiListField("bank_inst_id_list")
	@ApiField("string")
	private List<String> bankInstIdList;

	/**
	 * 优惠可用场景对应biz_scene,格式：场景a:子场景1,子场景2;场景b:子场景3,子场景4； 只有主场景格式为：场景a:;场景b:
	 */
	@ApiField("discount_use_scene_map_string")
	private String discountUseSceneMapString;

	/**
	 * 上页最后一个活动id，依赖这个进行分页，为空即第一页
	 */
	@ApiField("last_activity_id")
	private String lastActivityId;

	/**
	 * 一次查询活动数量限制，不填默认为10，最大100，超过100按照100处理
	 */
	@ApiField("limit")
	private Long limit;

	/**
	 * 来源，查询来源，初次接入，需要联系分配source
	 */
	@ApiField("source")
	private String source;

	/**
	 * 子来源，主要用来标识不同的业务块
	 */
	@ApiField("sub_source")
	private String subSource;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getActivityTypeList() {
		return this.activityTypeList;
	}
	public void setActivityTypeList(List<String> activityTypeList) {
		this.activityTypeList = activityTypeList;
	}

	public List<String> getBankCardTypeList() {
		return this.bankCardTypeList;
	}
	public void setBankCardTypeList(List<String> bankCardTypeList) {
		this.bankCardTypeList = bankCardTypeList;
	}

	public List<String> getBankInstIdList() {
		return this.bankInstIdList;
	}
	public void setBankInstIdList(List<String> bankInstIdList) {
		this.bankInstIdList = bankInstIdList;
	}

	public String getDiscountUseSceneMapString() {
		return this.discountUseSceneMapString;
	}
	public void setDiscountUseSceneMapString(String discountUseSceneMapString) {
		this.discountUseSceneMapString = discountUseSceneMapString;
	}

	public String getLastActivityId() {
		return this.lastActivityId;
	}
	public void setLastActivityId(String lastActivityId) {
		this.lastActivityId = lastActivityId;
	}

	public Long getLimit() {
		return this.limit;
	}
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubSource() {
		return this.subSource;
	}
	public void setSubSource(String subSource) {
		this.subSource = subSource;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

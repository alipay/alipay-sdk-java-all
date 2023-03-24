package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量位规则
 *
 * @author auto create
 * @since 1.0, 2021-04-06 21:37:38
 */
public class MiniResourceRule extends AlipayObject {

	private static final long serialVersionUID = 7144366114973295174L;

	/**
	 * 选品类目ID，在type为CHOOSE_RULE的时候必填
	 */
	@ApiField("floor_id")
	private String floorId;

	/**
	 * 推广位ID, 在type为RESOURCE_ORIGIN的时候必填，在淘联盟中identity_id是一个用三个 "_" 分隔的字符串.
	 */
	@ApiField("identity_id")
	private String identityId;

	/**
	 * 推广位名称，在type为RESOURCE_ORIGIN时必填
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 过滤的商品ID列表,用英文逗号分隔。仅仅在type值为FILTER_RULE的时候需要传；
	 */
	@ApiField("item_id_list")
	private String itemIdList;

	/**
	 * 推广位来源，在type为RESOURCE_ORIGIN的时候必填
	 */
	@ApiField("origin")
	private String origin;

	/**
	 * 规则id，在修改流量位规则时必填；在新增流量位时不填，如果传入则忽略；
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 规则名称
	 */
	@ApiField("rule_name")
	private String ruleName;

	/**
	 * 规则类型，规则保存成功后，规则类型不可更改，在更新请求中传入type将被忽略。以下是目前受支持的type值：
RESOURCE_ORIGIN：来源规则，例如陶联盟；
FILTER_RULE：滤品规则，用于过滤指定商品；
CHOOSE_RULE：选品规则，用于选取符合条件的商品；
	 */
	@ApiField("type")
	private String type;

	public String getFloorId() {
		return this.floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(String itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return this.ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

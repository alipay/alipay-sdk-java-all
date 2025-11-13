package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 配置模式
 *
 * @author auto create
 * @since 1.0, 2025-10-24 14:27:41
 */
public class GroupConfigModelConfig extends AlipayObject {

	private static final long serialVersionUID = 1757499784482148832L;

	/**
	 * null
	 */
	@ApiListField("check_condition")
	@ApiField("string")
	private List<String> checkCondition;

	/**
	 * 碰一下开门是否需要阻断检查，非阻断情况降级走手机号
	 */
	@ApiField("need_block_check")
	private Boolean needBlockCheck;

	/**
	 * 默认手机号-MOBILE
会员id-MEMBER_ID
支付宝openid-OPEN_ID
	 */
	@ApiField("user_relate_type")
	private String userRelateType;

	public List<String> getCheckCondition() {
		return this.checkCondition;
	}
	public void setCheckCondition(List<String> checkCondition) {
		this.checkCondition = checkCondition;
	}

	public Boolean getNeedBlockCheck() {
		return this.needBlockCheck;
	}
	public void setNeedBlockCheck(Boolean needBlockCheck) {
		this.needBlockCheck = needBlockCheck;
	}

	public String getUserRelateType() {
		return this.userRelateType;
	}
	public void setUserRelateType(String userRelateType) {
		this.userRelateType = userRelateType;
	}

}

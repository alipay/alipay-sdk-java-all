package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝发放接口
 *
 * @author auto create
 * @since 1.0, 2024-06-17 20:22:50
 */
public class AlipayUserAlipaypointSendModel extends AlipayObject {

	private static final long serialVersionUID = 8162187776534861755L;

	/**
	 * 签约商户的集分宝的预算库，扣除此预算库的集分宝发放给用户。会校验budgetcode和业务方appId的签约商户pid的关联关系，若无关则发放失败。
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/**
	 * 商户关于该笔发放的描述或者信息补充，仅存储，无实际校验功能，该信息会在"集分宝"小程序的"集分宝明细"中展示给用户。
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 被发放集分宝用户ID，商户app_id维度下的用户标识，与user_account字段二选一。 建议优先使该字段指定发放用户，接口性能更佳
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 接入方自己交易的唯一流水ID号，不同交易请保证幂等号唯一性，集分宝服务将依据该字段来进行幂等控制，重试请求不要更换幂等号，需要慎重传递，否则可能会造成损失。
	 */
	@ApiField("partner_biz_no")
	private String partnerBizNo;

	/**
	 * 发放给用户的集分宝个数。个数区间为 [1,10000000]，需为整数。
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 被发放集分宝用户的支付宝登录号，邮箱地址或者手机号均可，与user_id字段二选一，在有user_id时，优先使用user_id字段。
	 */
	@ApiField("user_account")
	private String userAccount;

	/**
	 * 被发放集分宝用户的蚂蚁统一会员ID，与user_account字段二选一。
建议优先使用user_id，接口性能更佳，user_id和user_account都传递时，系统优先使用本字段。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPartnerBizNo() {
		return this.partnerBizNo;
	}
	public void setPartnerBizNo(String partnerBizNo) {
		this.partnerBizNo = partnerBizNo;
	}

	public Long getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	public String getUserAccount() {
		return this.userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}

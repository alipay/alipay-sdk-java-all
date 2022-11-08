package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益宝权益发放openapi接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 19:14:17
 */
public class AlipayUserQuanyibaoOpenbenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 7799479263966973672L;

	/**
	 * 支付宝登录账号，支持邮箱和手机号格式，与alipay_user_id字段必须选填一个
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/**
	 * 支付宝的会员ID，与alipay_login_id字段必须选填一个
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 要发放的权益id，权益需联系权益宝业务方获取
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益发放扩展字段，用于权益发放动作的额外补充，如备注信息。由权益宝定义，使用时需提前和权益宝沟通是否满足需求
	 */
	@ApiListField("ext_info")
	@ApiField("q_y_b_map_info")
	private List<QYBMapInfo> extInfo;

	/**
	 * 权益宝权益发放备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 权益发放第三方业务号，权益宝会使用该字段做幂等，请保证该值唯一
	 */
	@ApiField("third_biz_no")
	private String thirdBizNo;

	public String getAlipayLoginId() {
		return this.alipayLoginId;
	}
	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public List<QYBMapInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<QYBMapInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getThirdBizNo() {
		return this.thirdBizNo;
	}
	public void setThirdBizNo(String thirdBizNo) {
		this.thirdBizNo = thirdBizNo;
	}

}

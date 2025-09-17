package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡兑换凭证详情
 *
 * @author auto create
 * @since 1.0, 2024-02-23 14:28:39
 */
public class MemberCardCertificateDetail extends AlipayObject {

	private static final long serialVersionUID = 1734542693754348422L;

	/**
	 * 兑换跳转链接（长链接），其中已包含了凭证token唯一信息，如其他用户获取到链接后也可进行兑换（未开启身份校验）
	 */
	@ApiField("direct_url")
	private String directUrl;

	/**
	 * 凭证生效时间
	 */
	@ApiField("effect_time")
	private Date effectTime;

	/**
	 * 凭证过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 凭证唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 用户兑换开通凭证的唯一业务流水号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 凭证状态：
P：可使用
S：使用完毕
R：已撤销
注：P状态不代表一定可用，需要或可能进行使用时间以及用户身份的校验
	 */
	@ApiField("status")
	private String status;

	/**
	 * 凭证可兑换的目标，如用户兑换的会员卡商品skuId
	 */
	@ApiField("target")
	private String target;

	/**
	 * 用户兑换凭证可使用的次数，一般为1次，默认为1次
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 兑换跳转链接，其中已包含了凭证token唯一信息，如其他用户获取到链接后也可进行兑换（未开启身份校验）
	 */
	@ApiField("url")
	private String url;

	/**
	 * 凭证已使用次数
	 */
	@ApiField("usage_count")
	private Long usageCount;

	/**
	 * 用户兑换凭证时的手机号信息，仅支持中国大陆11位手机号码
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 凭证的值，如凭证兑换码
	 */
	@ApiField("value")
	private String value;

	/**
	 * 使用凭证的用户支付宝账户校验模式，默认不进行校验 UID：按凭证同步时传入的user_id校验用户支付宝登录账户的uid MOBILE：按凭证同步时传入的user_mobile校验用户支付宝登录账户的注册手机号
	 */
	@ApiField("verify_mode")
	private String verifyMode;

	public String getDirectUrl() {
		return this.directUrl;
	}
	public void setDirectUrl(String directUrl) {
		this.directUrl = directUrl;
	}

	public Date getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(Date effectTime) {
		this.effectTime = effectTime;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getUsageCount() {
		return this.usageCount;
	}
	public void setUsageCount(Long usageCount) {
		this.usageCount = usageCount;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getVerifyMode() {
		return this.verifyMode;
	}
	public void setVerifyMode(String verifyMode) {
		this.verifyMode = verifyMode;
	}

}

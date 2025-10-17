package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构代客户申贷
 *
 * @author auto create
 * @since 1.0, 2022-02-17 13:47:47
 */
public class MybankCreditLoanapplyApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4578537496436734919L;

	/**
	 * 客户的支付宝ID，注意：如果site为ALIPAY，此参数login_id和参数alipay_id至少有一个不能为空。
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 申请金额，默认以元为单位，支持精确到小数点后2位，为了便于传输，调用方需要把double类型的金额转换为string类型
	 */
	@ApiField("apply_lmt")
	private String applyLmt;

	/**
	 * 关联实体，申贷主体可以关联一些其他实体比方说一个企业，一个会员账号用来作为申贷材料辅助申贷
	 */
	@ApiListField("associate_entitys")
	@ApiField("involved_entity")
	private List<InvolvedEntity> associateEntitys;

	/**
	 * 业务编号，比如当使用一笔订单创建授信申请时，业务编号就是订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 授信申请的场景码，1表示普通客户申请，2表示订单申请，可扩展场景
	 */
	@ApiField("biz_scene_no")
	private String bizSceneNo;

	/**
	 * 业务类型
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 客户的身份证号码，如果参数biz_scene_no为1，则为必填
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，01:身份证，如果参数biz_scene_no为1，则为必填
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 联系邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 扩展数据（map转换为json字符串）
	 */
	@ApiField("ext_par")
	private String extPar;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 会员的登录账号，比如支付宝登录账号，一般为手机号或邮箱，注意：如果site为ALIPAY，此参数login_id和参数alipay_id至少有一个不能为空。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 联系手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 客户姓名，如果参数biz_scene_no为1，则为必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 运营产品码，平台大数贷机构无须填写
	 */
	@ApiField("op_pd_code")
	private String opPdCode;

	/**
	 * 外部机构定义的客户编号
	 */
	@ApiField("out_mem_id")
	private String outMemId;

	/**
	 * 外部统一编码，外部机构与网商合作的方案产品标识，用于标识所属的合作业务，op_pd_code为空时该字段必传。
	 */
	@ApiField("out_uni_code")
	private String outUniCode;

	/**
	 * 外部流水号,唯一标识客户的一笔贷款申请。格式：日期(8位)+序列号(8位）,序列号是数字，如00000001（必须是16位且符合该格式）。
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * ALIPAY:支付宝
MYBANK:网商银行
TMALL：天猫
TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点用户ID，跟SITE对应，若SITE是ALIPAY则为支付宝ID，若SITE是ICBU则为ICBU 用户ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getApplyLmt() {
		return this.applyLmt;
	}
	public void setApplyLmt(String applyLmt) {
		this.applyLmt = applyLmt;
	}

	public List<InvolvedEntity> getAssociateEntitys() {
		return this.associateEntitys;
	}
	public void setAssociateEntitys(List<InvolvedEntity> associateEntitys) {
		this.associateEntitys = associateEntitys;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizSceneNo() {
		return this.bizSceneNo;
	}
	public void setBizSceneNo(String bizSceneNo) {
		this.bizSceneNo = bizSceneNo;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getExtPar() {
		return this.extPar;
	}
	public void setExtPar(String extPar) {
		this.extPar = extPar;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpPdCode() {
		return this.opPdCode;
	}
	public void setOpPdCode(String opPdCode) {
		this.opPdCode = opPdCode;
	}

	public String getOutMemId() {
		return this.outMemId;
	}
	public void setOutMemId(String outMemId) {
		this.outMemId = outMemId;
	}

	public String getOutUniCode() {
		return this.outUniCode;
	}
	public void setOutUniCode(String outUniCode) {
		this.outUniCode = outUniCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}

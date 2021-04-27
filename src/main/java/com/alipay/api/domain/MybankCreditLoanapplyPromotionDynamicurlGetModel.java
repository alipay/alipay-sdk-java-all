package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取推广活动的动态链接
 *
 * @author auto create
 * @since 1.0, 2021-03-30 20:13:42
 */
public class MybankCreditLoanapplyPromotionDynamicurlGetModel extends AlipayObject {

	private static final long serialVersionUID = 3518943826815739193L;

	/**
	 * 机构合约编号，商户接入企业信贷业务时自动分配，获取地址：https://partner.mybank.cn/cooperation/myCooperation.htm，路径：我的合作-查看详情-开发接口调用-接口合约编号；
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 动态链接使用场景。地推工具外投必填字段
01-地推工具外投。
（机构特殊外投才需要，否则可以忽略该字段不需填入）
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 部门编码，是网商机构门户内维护的组织结构中部门的唯一编号，由网商机构门户生成后提供给合作机构，参数staff_type为01或03时，此参数必填
	 */
	@ApiField("dept_code")
	private String deptCode;

	/**
	 * 推广机构内部员工编号。（机构特殊外投才需要，否则可以忽略该字段不需填入）
	 */
	@ApiField("inst_staff_no")
	private String instStaffNo;

	/**
	 * 渠道编码，是网商机构门户内维护的推广渠道的唯一编号，由网商机构门户生成后提供给合作机构，参数staff_type为01或03时，此参数必填
	 */
	@ApiField("op_ch_code")
	private String opChCode;

	/**
	 * 被推荐人的证件名字，当staff_type为03时需要填写，passiver_cert_no + passiver_cert_name或者passiver_id不能同时为空。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户同人校验
	 */
	@ApiField("passiver_cert_name")
	private String passiverCertName;

	/**
	 * 被推荐人的证件号，当staff_type为03时需要填写，passiver_cert_no + passiver_cert_name或者passiver_id不能同时为空。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户同人校验
	 */
	@ApiField("passiver_cert_no")
	private String passiverCertNo;

	/**
	 * 被推荐人的支付宝ID，当staff_type为03时需要填写，passiver_cert_no + passiver_cert_name或者passiver_id不能同时为空。作用：校验机构提供的用户和支付宝当前登录的用户为同一用户，即用户同人校验
	 */
	@ApiField("passiver_id")
	private String passiverId;

	/**
	 * 合作推广机构的银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识，参数staff_type为01或03时，此参数必填
	 */
	@ApiField("recmd_inst_ip_id")
	private String recmdInstIpId;

	/**
	 * 合作推广机构的银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识，参数staff_type为01或03时，此参数必填
	 */
	@ApiField("recmd_inst_ip_role_id")
	private String recmdInstIpRoleId;

	/**
	 * 请求的实体ID，跟staff_type对应，若staff_type是01则为支付宝账号；若staff_type是02则为生活号在支付宝开放平台对应的app_id；若staff_type是03则为机构在支付宝开放平台对应的app_id。
biz_scene有值则staff_id不需要校验，否则必填
	 */
	@ApiField("staff_id")
	private String staffId;

	/**
	 * 请求的主体类型，01表示普通用户类型，02表示生活号类型，03表示机构类型
	 */
	@ApiField("staff_type")
	private String staffType;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getDeptCode() {
		return this.deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getInstStaffNo() {
		return this.instStaffNo;
	}
	public void setInstStaffNo(String instStaffNo) {
		this.instStaffNo = instStaffNo;
	}

	public String getOpChCode() {
		return this.opChCode;
	}
	public void setOpChCode(String opChCode) {
		this.opChCode = opChCode;
	}

	public String getPassiverCertName() {
		return this.passiverCertName;
	}
	public void setPassiverCertName(String passiverCertName) {
		this.passiverCertName = passiverCertName;
	}

	public String getPassiverCertNo() {
		return this.passiverCertNo;
	}
	public void setPassiverCertNo(String passiverCertNo) {
		this.passiverCertNo = passiverCertNo;
	}

	public String getPassiverId() {
		return this.passiverId;
	}
	public void setPassiverId(String passiverId) {
		this.passiverId = passiverId;
	}

	public String getRecmdInstIpId() {
		return this.recmdInstIpId;
	}
	public void setRecmdInstIpId(String recmdInstIpId) {
		this.recmdInstIpId = recmdInstIpId;
	}

	public String getRecmdInstIpRoleId() {
		return this.recmdInstIpRoleId;
	}
	public void setRecmdInstIpRoleId(String recmdInstIpRoleId) {
		this.recmdInstIpRoleId = recmdInstIpRoleId;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffType() {
		return this.staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

}

package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建进件记录
 *
 * @author auto create
 * @since 1.0, 2022-10-28 11:09:14
 */
public class AlipayFinancialnetPromotionApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5247892647143294837L;

	/**
	 * 申请人支付宝UID
	 */
	@ApiField("apply_open_id")
	private String applyOpenId;

	/**
	 * 额度申请需要传入：
1. 进件模版信息
2. 业务订单扩展字段extParam，json格式,  firstpayamt,lastpayamt,monthpayamt下单要求必传，值大于等于0
	 */
	@ApiField("apply_template_info")
	private String applyTemplateInfo;

	/**
	 * 申请人支付宝UID
	 */
	@ApiField("apply_user_id")
	private String applyUserId;

	/**
	 * 车商合作伙伴id，蚂蚁机构信息中心分配
	 */
	@ApiField("asset_inst_id")
	private String assetInstId;

	/**
	 * 门店id，蚂蚁机构信息中心入驻分配
	 */
	@ApiField("asset_resource_id")
	private String assetResourceId;

	/**
	 * 合作平台系统ID（蚂蚁分配）
	 */
	@ApiField("entry_app_id")
	private String entryAppId;

	/**
	 * 网商分配资方路由码
	 */
	@ApiField("finance_inst_iprole_id")
	private String financeInstIproleId;

	/**
	 * 资方合作伙伴id，蚂蚁机构信息中心分配
	 */
	@ApiField("fund_inst_id")
	private String fundInstId;

	/**
	 * 机构编码，机构接入网商场景金融平台时分配，固定值
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 机构产品码，机构接入网商场景金融平台时分配，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 推广人支付宝UID
	 */
	@ApiField("promote_open_id")
	private String promoteOpenId;

	/**
	 * 推广人支付宝UID
	 */
	@ApiField("promote_user_id")
	private String promoteUserId;

	/**
	 * 签约参数
	 */
	@ApiField("sign_info")
	private SignInfo signInfo;

	public String getApplyOpenId() {
		return this.applyOpenId;
	}
	public void setApplyOpenId(String applyOpenId) {
		this.applyOpenId = applyOpenId;
	}

	public String getApplyTemplateInfo() {
		return this.applyTemplateInfo;
	}
	public void setApplyTemplateInfo(String applyTemplateInfo) {
		this.applyTemplateInfo = applyTemplateInfo;
	}

	public String getApplyUserId() {
		return this.applyUserId;
	}
	public void setApplyUserId(String applyUserId) {
		this.applyUserId = applyUserId;
	}

	public String getAssetInstId() {
		return this.assetInstId;
	}
	public void setAssetInstId(String assetInstId) {
		this.assetInstId = assetInstId;
	}

	public String getAssetResourceId() {
		return this.assetResourceId;
	}
	public void setAssetResourceId(String assetResourceId) {
		this.assetResourceId = assetResourceId;
	}

	public String getEntryAppId() {
		return this.entryAppId;
	}
	public void setEntryAppId(String entryAppId) {
		this.entryAppId = entryAppId;
	}

	public String getFinanceInstIproleId() {
		return this.financeInstIproleId;
	}
	public void setFinanceInstIproleId(String financeInstIproleId) {
		this.financeInstIproleId = financeInstIproleId;
	}

	public String getFundInstId() {
		return this.fundInstId;
	}
	public void setFundInstId(String fundInstId) {
		this.fundInstId = fundInstId;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPromoteOpenId() {
		return this.promoteOpenId;
	}
	public void setPromoteOpenId(String promoteOpenId) {
		this.promoteOpenId = promoteOpenId;
	}

	public String getPromoteUserId() {
		return this.promoteUserId;
	}
	public void setPromoteUserId(String promoteUserId) {
		this.promoteUserId = promoteUserId;
	}

	public SignInfo getSignInfo() {
		return this.signInfo;
	}
	public void setSignInfo(SignInfo signInfo) {
		this.signInfo = signInfo;
	}

}

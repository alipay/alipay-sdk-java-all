package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BrandInfoModel;
import com.alipay.api.domain.CategoryInfoModel;
import com.alipay.api.domain.EsStoreAuditOpenResult;
import com.alipay.api.domain.SettleInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astore.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-29 09:57:55
 */
public class AntMerchantExpandAstoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6549834982229495484L;

	/** 
	 * 店铺id
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/** 
	 * 店铺LOGO 地址
	 */
	@ApiField("a_store_logo")
	private String aStoreLogo;

	/** 
	 * 店铺名称
	 */
	@ApiField("a_store_name")
	private String aStoreName;

	/** 
	 * 申请业务类型： INDIVIDUAL 独立门店
BRAND 品牌连锁门店
SINGLE_MALL  单体mall
HEAD_MALL 总部mall
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 品牌信息
	 */
	@ApiField("brand_info")
	private BrandInfoModel brandInfo;

	/** 
	 * 商家经营类目
	 */
	@ApiField("category_info")
	private CategoryInfoModel categoryInfo;

	/** 
	 * 最新的直付通入驻订单审核结果
	 */
	@ApiField("es_store_audit_result")
	private EsStoreAuditOpenResult esStoreAuditResult;

	/** 
	 * 联系手机号(示例值是示范,正常返回不需要掩码)
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 商户OID
	 */
	@ApiField("oid")
	private String oid;

	/** 
	 * 外部业务编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 结算信息模型
	 */
	@ApiField("settle_infos")
	private SettleInfoModel settleInfos;

	/** 
	 * 二级商户id
	 */
	@ApiField("smid")
	private String smid;

	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
	}
	public String getaStoreId( ) {
		return this.aStoreId;
	}

	public void setaStoreLogo(String aStoreLogo) {
		this.aStoreLogo = aStoreLogo;
	}
	public String getaStoreLogo( ) {
		return this.aStoreLogo;
	}

	public void setaStoreName(String aStoreName) {
		this.aStoreName = aStoreName;
	}
	public String getaStoreName( ) {
		return this.aStoreName;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setBrandInfo(BrandInfoModel brandInfo) {
		this.brandInfo = brandInfo;
	}
	public BrandInfoModel getBrandInfo( ) {
		return this.brandInfo;
	}

	public void setCategoryInfo(CategoryInfoModel categoryInfo) {
		this.categoryInfo = categoryInfo;
	}
	public CategoryInfoModel getCategoryInfo( ) {
		return this.categoryInfo;
	}

	public void setEsStoreAuditResult(EsStoreAuditOpenResult esStoreAuditResult) {
		this.esStoreAuditResult = esStoreAuditResult;
	}
	public EsStoreAuditOpenResult getEsStoreAuditResult( ) {
		return this.esStoreAuditResult;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOid( ) {
		return this.oid;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setSettleInfos(SettleInfoModel settleInfos) {
		this.settleInfos = settleInfos;
	}
	public SettleInfoModel getSettleInfos( ) {
		return this.settleInfos;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

}

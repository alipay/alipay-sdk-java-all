package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BrandInfoModel;
import com.alipay.api.domain.CategoryInfoModel;
import com.alipay.api.domain.SettleInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astore.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 18:07:41
 */
public class AntMerchantExpandAstoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3818454798244432452L;

	/** 
	 * 店铺id
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/** 
	 * 店铺名称
	 */
	@ApiField("a_store_name")
	private String aStoreName;

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

	public void setaStoreName(String aStoreName) {
		this.aStoreName = aStoreName;
	}
	public String getaStoreName( ) {
		return this.aStoreName;
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

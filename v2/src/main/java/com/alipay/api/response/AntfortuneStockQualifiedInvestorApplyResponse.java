package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvestorMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.qualified.investor.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 11:06:31
 */
public class AntfortuneStockQualifiedInvestorApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1299793982493675259L;

	/** 
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 用户在支付宝总资产获取时间
	 */
	@ApiField("alipay_asset_time")
	private String alipayAssetTime;

	/** 
	 * 支付宝金融总资产金额，单位元；精度到分
	 */
	@ApiField("alipay_total_asset")
	private String alipayTotalAsset;

	/** 
	 * 余额宝首次交易时间，格式yyyyMMdd
	 */
	@ApiField("first_yeb_trade_day")
	private String firstYebTradeDay;

	/** 
	 * 是否有合投材料
	 */
	@ApiField("has_material")
	private Boolean hasMaterial;

	/** 
	 * 材料列表
	 */
	@ApiListField("material_list")
	@ApiField("investor_material_info")
	private List<InvestorMaterialInfo> materialList;

	/** 
	 * 材料类型
	 */
	@ApiField("material_type")
	private String materialType;

	/** 
	 * 码商收入金额，单位元；精度到分
	 */
	@ApiField("total_income")
	private String totalIncome;

	/** 
	 * traceId，用来唯一定位某次调用，方便问题排查
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAlipayAssetTime(String alipayAssetTime) {
		this.alipayAssetTime = alipayAssetTime;
	}
	public String getAlipayAssetTime( ) {
		return this.alipayAssetTime;
	}

	public void setAlipayTotalAsset(String alipayTotalAsset) {
		this.alipayTotalAsset = alipayTotalAsset;
	}
	public String getAlipayTotalAsset( ) {
		return this.alipayTotalAsset;
	}

	public void setFirstYebTradeDay(String firstYebTradeDay) {
		this.firstYebTradeDay = firstYebTradeDay;
	}
	public String getFirstYebTradeDay( ) {
		return this.firstYebTradeDay;
	}

	public void setHasMaterial(Boolean hasMaterial) {
		this.hasMaterial = hasMaterial;
	}
	public Boolean getHasMaterial( ) {
		return this.hasMaterial;
	}

	public void setMaterialList(List<InvestorMaterialInfo> materialList) {
		this.materialList = materialList;
	}
	public List<InvestorMaterialInfo> getMaterialList( ) {
		return this.materialList;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public String getMaterialType( ) {
		return this.materialType;
	}

	public void setTotalIncome(String totalIncome) {
		this.totalIncome = totalIncome;
	}
	public String getTotalIncome( ) {
		return this.totalIncome;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}

package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentRiskProVO;
import com.alipay.api.domain.ConsultFailReason;
import com.alipay.api.domain.RiskBasicInfoVO;
import com.alipay.api.domain.RentRiskInfoVO;
import com.alipay.api.domain.ShipGoodsRiskVO;
import com.alipay.api.domain.VerticalRiskVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.risk.consult response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-23 15:37:45
 */
public class AlipayCommerceRentRiskConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6494736638454617786L;

	/** 
	 * 长租/汽车订阅：Tn_Level类型结果，risk_level字段取值范围T1-T10（T1 ~ T4: 低风险；T5 ~ T6: 中风险；T7 ~ T8: 高风险；T9 ~ T10: 极高风险）
短租：Sn_Level类型结果, risk_level字段取值范围S1-S5 （S1-S3：低风险，S4：中风险，S5：高风险）
	 */
	@ApiField("comprehensive_risk_models")
	private RentRiskProVO comprehensiveRiskModels;

	/** 
	 * null
	 */
	@ApiListField("consult_fail_reason")
	@ApiField("consult_fail_reason")
	private List<ConsultFailReason> consultFailReason;

	/** 
	 * Boolean类型结果，true-命中极低风险 false-未命中极低风险
	 */
	@ApiField("extremely_low_risk_models")
	private RentRiskProVO extremelyLowRiskModels;

	/** 
	 * Boolean类型结果，true-命中高风险 false-未命中高风险
	 */
	@ApiField("high_risk_models")
	private RentRiskProVO highRiskModels;

	/** 
	 * BASIC-租安盾基础版，面向全量租赁商户；
PRO-租安盾专业版，面向签约商户；
	 */
	@ApiField("product_edition")
	private String productEdition;

	/** 
	 * 风控基础信息
	 */
	@ApiField("risk_basic_info")
	private RiskBasicInfoVO riskBasicInfo;

	/** 
	 * null
	 */
	@ApiListField("risk_infos")
	@ApiField("rent_risk_info_v_o")
	private List<RentRiskInfoVO> riskInfos;

	/** 
	 * null
	 */
	@ApiListField("ship_goods_risk_models")
	@ApiField("ship_goods_risk_v_o")
	private List<ShipGoodsRiskVO> shipGoodsRiskModels;

	/** 
	 * 联营商户订单分组
	 */
	@ApiField("vam_group")
	private String vamGroup;

	/** 
	 * 【注意事项】此字段返回需要满足以下条件
1.3C租赁场景需签约租安盾产品
 2.订单需要完成代扣或免押签约后，才会返回值。
 3.租安盾产品订单——免押场景下需要配置租安盾策略且拉起免押受理台的策略是租安盾策略；
4.使用的风控策略类型为芝麻租赁租安盾长租策略: risk_policy_value=zhimazulin_zuandun
5.接口查询参数请求中?consult_risk_types=VERTICAL_RENT_RISK
其他信息可参考租安盾产品接入指南。
	 */
	@ApiField("vertical_risk_models")
	private VerticalRiskVO verticalRiskModels;

	public void setComprehensiveRiskModels(RentRiskProVO comprehensiveRiskModels) {
		this.comprehensiveRiskModels = comprehensiveRiskModels;
	}
	public RentRiskProVO getComprehensiveRiskModels( ) {
		return this.comprehensiveRiskModels;
	}

	public void setConsultFailReason(List<ConsultFailReason> consultFailReason) {
		this.consultFailReason = consultFailReason;
	}
	public List<ConsultFailReason> getConsultFailReason( ) {
		return this.consultFailReason;
	}

	public void setExtremelyLowRiskModels(RentRiskProVO extremelyLowRiskModels) {
		this.extremelyLowRiskModels = extremelyLowRiskModels;
	}
	public RentRiskProVO getExtremelyLowRiskModels( ) {
		return this.extremelyLowRiskModels;
	}

	public void setHighRiskModels(RentRiskProVO highRiskModels) {
		this.highRiskModels = highRiskModels;
	}
	public RentRiskProVO getHighRiskModels( ) {
		return this.highRiskModels;
	}

	public void setProductEdition(String productEdition) {
		this.productEdition = productEdition;
	}
	public String getProductEdition( ) {
		return this.productEdition;
	}

	public void setRiskBasicInfo(RiskBasicInfoVO riskBasicInfo) {
		this.riskBasicInfo = riskBasicInfo;
	}
	public RiskBasicInfoVO getRiskBasicInfo( ) {
		return this.riskBasicInfo;
	}

	public void setRiskInfos(List<RentRiskInfoVO> riskInfos) {
		this.riskInfos = riskInfos;
	}
	public List<RentRiskInfoVO> getRiskInfos( ) {
		return this.riskInfos;
	}

	public void setShipGoodsRiskModels(List<ShipGoodsRiskVO> shipGoodsRiskModels) {
		this.shipGoodsRiskModels = shipGoodsRiskModels;
	}
	public List<ShipGoodsRiskVO> getShipGoodsRiskModels( ) {
		return this.shipGoodsRiskModels;
	}

	public void setVamGroup(String vamGroup) {
		this.vamGroup = vamGroup;
	}
	public String getVamGroup( ) {
		return this.vamGroup;
	}

	public void setVerticalRiskModels(VerticalRiskVO verticalRiskModels) {
		this.verticalRiskModels = verticalRiskModels;
	}
	public VerticalRiskVO getVerticalRiskModels( ) {
		return this.verticalRiskModels;
	}

}

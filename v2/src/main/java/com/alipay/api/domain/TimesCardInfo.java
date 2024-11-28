package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 次卡信息
 *
 * @author auto create
 * @since 1.0, 2024-11-06 14:50:17
 */
public class TimesCardInfo extends AlipayObject {

	private static final long serialVersionUID = 3894676996233245189L;

	/**
	 * 违约金信息
	 */
	@ApiField("break_costs_info")
	private BreakCostsInfo breakCostsInfo;

	/**
	 * 资金模式，预付或先享
	 */
	@ApiListField("funding_model")
	@ApiField("string")
	private List<String> fundingModel;

	/**
	 * 当limit_type= LIMIT时，必选
	 */
	@ApiField("limit_num")
	private Long limitNum;

	/**
	 * 购买限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 剩余库存
	 */
	@ApiField("remain_stock")
	private Long remainStock;

	/**
	 * 卡库存，单位个，不传则不限库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 是否支持用户主动退卡。true表示用户可在有效期内主动退卡，无需商家操作，false表示商家可在后台订单管理中手动操作退卡，用户可电话联系商家协商退款
	 */
	@ApiField("support_withdraw")
	private Boolean supportWithdraw;

	/**
	 * 使用时段（分页查询接口不返回)。用于设置商品的使用时段
	 */
	@ApiField("use_duration")
	private UseDuration useDuration;

	public BreakCostsInfo getBreakCostsInfo() {
		return this.breakCostsInfo;
	}
	public void setBreakCostsInfo(BreakCostsInfo breakCostsInfo) {
		this.breakCostsInfo = breakCostsInfo;
	}

	public List<String> getFundingModel() {
		return this.fundingModel;
	}
	public void setFundingModel(List<String> fundingModel) {
		this.fundingModel = fundingModel;
	}

	public Long getLimitNum() {
		return this.limitNum;
	}
	public void setLimitNum(Long limitNum) {
		this.limitNum = limitNum;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public Long getRemainStock() {
		return this.remainStock;
	}
	public void setRemainStock(Long remainStock) {
		this.remainStock = remainStock;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public Boolean getSupportWithdraw() {
		return this.supportWithdraw;
	}
	public void setSupportWithdraw(Boolean supportWithdraw) {
		this.supportWithdraw = supportWithdraw;
	}

	public UseDuration getUseDuration() {
		return this.useDuration;
	}
	public void setUseDuration(UseDuration useDuration) {
		this.useDuration = useDuration;
	}

}

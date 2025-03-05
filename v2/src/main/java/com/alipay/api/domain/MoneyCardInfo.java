package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金额卡独有信息
 *
 * @author auto create
 * @since 1.0, 2024-12-20 13:31:52
 */
public class MoneyCardInfo extends AlipayObject {

	private static final long serialVersionUID = 5811536159947265267L;

	/**
	 * 可使用天数，单位天(购卡后立即生效，生效后x天失效）
	 */
	@ApiField("effective_duration")
	private Long effectiveDuration;

	/**
	 * 客服电话。请确认是一个正常的电话
	 */
	@ApiField("hotline")
	private String hotline;

	/**
	 * 每人限制购买数量，单位个
	 */
	@ApiField("limit_num")
	private Long limitNum;

	/**
	 * 购买限制类型
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 面额价，不支持小数，单位分。
字段值需要大于或等于sale_price。
	 */
	@ApiField("origin_price")
	private Long originPrice;

	/**
	 * 收单账号PID。可在哪些收单账号下核销（分页查询接口不返回）
	 */
	@ApiListField("pids")
	@ApiField("string")
	private List<String> pids;

	/**
	 * 剩余库存，单位个。分页查询接口返回
	 */
	@ApiField("remain_stock")
	private Long remainStock;

	/**
	 * 实际售卖价格，不支持小数，单位分。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 卡库存，单位个
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

	/**
	 * 核销方式
	 */
	@ApiField("use_type")
	private String useType;

	public Long getEffectiveDuration() {
		return this.effectiveDuration;
	}
	public void setEffectiveDuration(Long effectiveDuration) {
		this.effectiveDuration = effectiveDuration;
	}

	public String getHotline() {
		return this.hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
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

	public Long getOriginPrice() {
		return this.originPrice;
	}
	public void setOriginPrice(Long originPrice) {
		this.originPrice = originPrice;
	}

	public List<String> getPids() {
		return this.pids;
	}
	public void setPids(List<String> pids) {
		this.pids = pids;
	}

	public Long getRemainStock() {
		return this.remainStock;
	}
	public void setRemainStock(Long remainStock) {
		this.remainStock = remainStock;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
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

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

}

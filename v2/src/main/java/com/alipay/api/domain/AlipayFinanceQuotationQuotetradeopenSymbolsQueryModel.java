package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝行情symbol属性列表查询
 *
 * @author auto create
 * @since 1.0, 2025-04-11 15:01:19
 */
public class AlipayFinanceQuotationQuotetradeopenSymbolsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8871727798818893995L;

	/**
	 * 股票市场,多个市场按逗号分隔
	 */
	@ApiField("market")
	private String market;

	/**
	 * 股票子类型，支持批量，多个子类型用逗号分隔，参考：https://yuque.antfin-inc.com/finquot/wgciv0/ehvgvu
	 */
	@ApiField("sub_type")
	private String subType;

	/**
	 * 股票类型，如股票型(ES)、债券(D)、场内基金(EU),支持批量，多个类型按逗号分隔
	 */
	@ApiField("type")
	private String type;

	public String getMarket() {
		return this.market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

	public String getSubType() {
		return this.subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}

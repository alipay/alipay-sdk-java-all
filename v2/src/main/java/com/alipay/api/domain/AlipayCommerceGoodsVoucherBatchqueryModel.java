package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品活动查询
 *
 * @author auto create
 * @since 1.0, 2021-08-09 16:42:52
 */
public class AlipayCommerceGoodsVoucherBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2474211314144888124L;

	/**
	 * 商品信息
	 */
	@ApiField("goods_list")
	private BizfmcgGoods goodsList;

	/**
	 * isvId
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public BizfmcgGoods getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(BizfmcgGoods goodsList) {
		this.goodsList = goodsList;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}

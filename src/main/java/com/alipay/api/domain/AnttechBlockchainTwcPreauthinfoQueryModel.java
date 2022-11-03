package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权信息核验
 *
 * @author auto create
 * @since 1.0, 2022-10-28 20:21:13
 */
public class AnttechBlockchainTwcPreauthinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6246849221678471216L;

	/**
	 * 预授权码
	 */
	@ApiField("authno")
	private String authno;

	/**
	 * 1
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 付款者支付宝账户
	 */
	@ApiField("buyeruid")
	private String buyeruid;

	/**
	 * 1
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 收款者支付宝账号uid
	 */
	@ApiField("selleruid")
	private String selleruid;

	/**
	 * 预授权金额
	 */
	@ApiField("totalamount")
	private String totalamount;

	public String getAuthno() {
		return this.authno;
	}
	public void setAuthno(String authno) {
		this.authno = authno;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyeruid() {
		return this.buyeruid;
	}
	public void setBuyeruid(String buyeruid) {
		this.buyeruid = buyeruid;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public String getSelleruid() {
		return this.selleruid;
	}
	public void setSelleruid(String selleruid) {
		this.selleruid = selleruid;
	}

	public String getTotalamount() {
		return this.totalamount;
	}
	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

}

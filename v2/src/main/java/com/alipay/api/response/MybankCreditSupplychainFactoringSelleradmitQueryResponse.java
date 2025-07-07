package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.factoring.selleradmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-15 15:22:31
 */
public class MybankCreditSupplychainFactoringSelleradmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7632722587144639538L;

	/** 
	 * 是否已提交加白申请
	 */
	@ApiField("exsit")
	private String exsit;

	/** 
	 * 门店是否需要签约 
true:需要签约
false：不需要签约
	 */
	@ApiField("need_sign_ar")
	private Boolean needSignAr;

	/** 
	 * 不准入原因代码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 门店不准入原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 门店是否为不准入
	 */
	@ApiField("refused")
	private String refused;

	/** 
	 * 门店网商银行卡号
	 */
	@ApiListField("seller_mybank_card_no_list")
	@ApiField("string")
	private List<String> sellerMybankCardNoList;

	/** 
	 * 是否加白成功
	 */
	@ApiField("white")
	private String white;

	public void setExsit(String exsit) {
		this.exsit = exsit;
	}
	public String getExsit( ) {
		return this.exsit;
	}

	public void setNeedSignAr(Boolean needSignAr) {
		this.needSignAr = needSignAr;
	}
	public Boolean getNeedSignAr( ) {
		return this.needSignAr;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRefused(String refused) {
		this.refused = refused;
	}
	public String getRefused( ) {
		return this.refused;
	}

	public void setSellerMybankCardNoList(List<String> sellerMybankCardNoList) {
		this.sellerMybankCardNoList = sellerMybankCardNoList;
	}
	public List<String> getSellerMybankCardNoList( ) {
		return this.sellerMybankCardNoList;
	}

	public void setWhite(String white) {
		this.white = white;
	}
	public String getWhite( ) {
		return this.white;
	}

}

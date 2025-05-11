package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品保险变更事件同步
 *
 * @author auto create
 * @since 1.0, 2023-11-13 18:04:32
 */
public class AlipayInsSceneItemChangeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8173172968987255736L;

	/**
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("ecom_item_d_t_o")
	private List<EcomItemDTO> itemList;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 产品编码，标识某一类产品:SHX
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订购合约id
	 */
	@ApiField("purchase_contract_id")
	private String purchaseContractId;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public List<EcomItemDTO> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<EcomItemDTO> itemList) {
		this.itemList = itemList;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPurchaseContractId() {
		return this.purchaseContractId;
	}
	public void setPurchaseContractId(String purchaseContractId) {
		this.purchaseContractId = purchaseContractId;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}

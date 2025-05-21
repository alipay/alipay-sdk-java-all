package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.mall.walletrule.set response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 19:22:28
 */
public class AlipayCommerceMallWalletruleSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8423685777393275937L;

	/** 
	 * 操作类型为query时返回，此钱包模板下配置的核销数字化门店列表；操作类型为add时返回，此次操作下配置的已生效的核销数字化门店列表；
	 */
	@ApiListField("digital_shop_id_list")
	@ApiField("string")
	private List<String> digitalShopIdList;

	/** 
	 * 操作类型为query时返回，此钱包模板下配置的待生效核销数字化门店列表；操作类型为add时返回，此次操作下配置的待生效的核销数字化门店列表；
待生效数据：门店下暂无N设备数据
	 */
	@ApiListField("pending_shop_id_list")
	@ApiField("string")
	private List<String> pendingShopIdList;

	/** 
	 * 本次操作的钱包模板id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public void setDigitalShopIdList(List<String> digitalShopIdList) {
		this.digitalShopIdList = digitalShopIdList;
	}
	public List<String> getDigitalShopIdList( ) {
		return this.digitalShopIdList;
	}

	public void setPendingShopIdList(List<String> pendingShopIdList) {
		this.pendingShopIdList = pendingShopIdList;
	}
	public List<String> getPendingShopIdList( ) {
		return this.pendingShopIdList;
	}

	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}
	public String getWalletTemplateId( ) {
		return this.walletTemplateId;
	}

}

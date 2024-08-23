package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PackageItemOpenInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.einvpackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 19:32:03
 */
public class AlipayEbppInvoiceEinvpackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2279335722914626687L;

	/** 
	 * 发票包明细数据
	 */
	@ApiListField("package_item_info_list")
	@ApiField("package_item_open_info")
	private List<PackageItemOpenInfo> packageItemInfoList;

	public void setPackageItemInfoList(List<PackageItemOpenInfo> packageItemInfoList) {
		this.packageItemInfoList = packageItemInfoList;
	}
	public List<PackageItemOpenInfo> getPackageItemInfoList( ) {
		return this.packageItemInfoList;
	}

}

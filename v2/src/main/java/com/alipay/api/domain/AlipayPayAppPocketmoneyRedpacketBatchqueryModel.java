package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 儿童手表红包批量查询
 *
 * @author auto create
 * @since 1.0, 2024-11-27 11:13:20
 */
public class AlipayPayAppPocketmoneyRedpacketBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4415555956115146361L;

	/**
	 * 待查询红包外部单号， 由业务方自定义 ，在支付宝完成红包发送后厂商可根据外部单号查询红包详细信息，数据类型为数组
	 */
	@ApiListField("red_pocket_out_nos")
	@ApiField("string")
	private List<String> redPocketOutNos;

	/**
	 * 厂商名称  不在白名单内厂商查询结果报错无查询权限
	 */
	@ApiField("vendor_name")
	private String vendorName;

	public List<String> getRedPocketOutNos() {
		return this.redPocketOutNos;
	}
	public void setRedPocketOutNos(List<String> redPocketOutNos) {
		this.redPocketOutNos = redPocketOutNos;
	}

	public String getVendorName() {
		return this.vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

}

package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回传码物料码值
 *
 * @author auto create
 * @since 1.0, 2018-09-25 11:42:39
 */
public class KoubeiSalesKbassetStuffQrcodereturnSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7559745852886967633L;

	/**
	 * 供应商回传码物料码值记录（最多200条）
	 */
	@ApiListField("return_qrcodes")
	@ApiField("access_return_qrcode")
	private List<AccessReturnQrcode> returnQrcodes;

	public List<AccessReturnQrcode> getReturnQrcodes() {
		return this.returnQrcodes;
	}
	public void setReturnQrcodes(List<AccessReturnQrcode> returnQrcodes) {
		this.returnQrcodes = returnQrcodes;
	}

}

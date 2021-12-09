package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行银行码明细数据查询
 *
 * @author auto create
 * @since 1.0, 2021-07-07 19:16:45
 */
public class AlipayUserDtbankQrcodedataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8733449594622646755L;

	/**
	 * 查询的数据日期
	 */
	@ApiField("data_date")
	private String dataDate;

	/**
	 * 二维码Id
	 */
	@ApiField("qrcode_id")
	private String qrcodeId;

	/**
	 * 二维码外部ID
	 */
	@ApiField("qrcode_out_id")
	private String qrcodeOutId;

	public String getDataDate() {
		return this.dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}

	public String getQrcodeId() {
		return this.qrcodeId;
	}
	public void setQrcodeId(String qrcodeId) {
		this.qrcodeId = qrcodeId;
	}

	public String getQrcodeOutId() {
		return this.qrcodeOutId;
	}
	public void setQrcodeOutId(String qrcodeOutId) {
		this.qrcodeOutId = qrcodeOutId;
	}

}

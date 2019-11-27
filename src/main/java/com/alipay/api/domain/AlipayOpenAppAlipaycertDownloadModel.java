package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用支付宝公钥证书下载
 *
 * @author auto create
 * @since 1.0, 2019-11-27 10:56:29
 */
public class AlipayOpenAppAlipaycertDownloadModel extends AlipayObject {

	private static final long serialVersionUID = 3862821633431182313L;

	/**
	 * 支付宝公钥证书序列号
	 */
	@ApiField("alipay_cert_sn")
	private String alipayCertSn;

	public String getAlipayCertSn() {
		return this.alipayCertSn;
	}
	public void setAlipayCertSn(String alipayCertSn) {
		this.alipayCertSn = alipayCertSn;
	}

}

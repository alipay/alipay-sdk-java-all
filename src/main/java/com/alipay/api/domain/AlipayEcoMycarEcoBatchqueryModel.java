package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哦复合物
 *
 * @author auto create
 * @since 1.0, 2017-05-12 15:44:15
 */
public class AlipayEcoMycarEcoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3336513369375159787L;

	/**
	 * <a href="http://www.w3school.com.cn">点击查看</a>
	 */
	@ApiField("osangh")
	private String osangh;

	public String getOsangh() {
		return this.osangh;
	}
	public void setOsangh(String osangh) {
		this.osangh = osangh;
	}

}

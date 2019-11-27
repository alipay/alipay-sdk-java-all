package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 鲍瑞测试接口
 *
 * @author auto create
 * @since 1.0, 2018-11-12 17:49:16
 */
public class AntMerchantExpandBaoruiBaoruiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3824342481481363216L;

	/**
	 * 鲍瑞测试通俗易懂
	 */
	@ApiField("neirong")
	private String neirong;

	public String getNeirong() {
		return this.neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}

}

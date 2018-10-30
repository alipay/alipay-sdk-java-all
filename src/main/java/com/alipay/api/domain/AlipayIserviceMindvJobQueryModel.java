package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角_问卷查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-19 16:54:34
 */
public class AlipayIserviceMindvJobQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5415884498748185448L;

	/**
	 * 问卷id_系统内唯一_根据问卷id查询问卷相关信息
	 */
	@ApiField("id")
	private Long id;

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}

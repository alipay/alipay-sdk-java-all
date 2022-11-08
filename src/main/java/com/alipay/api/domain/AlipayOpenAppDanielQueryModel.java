package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 丹尼的测试接口
 *
 * @author auto create
 * @since 1.0, 2022-08-16 17:28:05
 */
public class AlipayOpenAppDanielQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7474252253467514186L;

	/**
	 * 3
	 */
	@ApiField("daniel_path")
	private Long danielPath;

	/**
	 * fds
	 */
	@ApiField("daniel_query")
	private String danielQuery;

	public Long getDanielPath() {
		return this.danielPath;
	}
	public void setDanielPath(Long danielPath) {
		this.danielPath = danielPath;
	}

	public String getDanielQuery() {
		return this.danielQuery;
	}
	public void setDanielQuery(String danielQuery) {
		this.danielQuery = danielQuery;
	}

}

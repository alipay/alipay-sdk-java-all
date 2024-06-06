package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蚁触角_查询快照数据
 *
 * @author auto create
 * @since 1.0, 2018-09-19 16:55:24
 */
public class AlipayIserviceMindvSnapshotQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5367975716142678243L;

	/**
	 * 问卷/试卷快照id信息，供系统检索快照内容
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

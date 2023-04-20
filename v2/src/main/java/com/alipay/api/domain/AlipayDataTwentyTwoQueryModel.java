package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lhy三月二十二日文档测试
 *
 * @author auto create
 * @since 1.0, 2023-04-18 16:18:02
 */
public class AlipayDataTwentyTwoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6143853653818529798L;

	/**
	 * body基础描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * id基础描述
	 */
	@ApiField("id")
	private String id;

	/**
	 * id_open_id基础描述
	 */
	@ApiField("id_open_id")
	private String idOpenId;

	/**
	 * path基础描述
	 */
	@ApiField("path")
	private String path;

	/**
	 * query基础描述
	 */
	@ApiField("query")
	private String query;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getIdOpenId() {
		return this.idOpenId;
	}
	public void setIdOpenId(String idOpenId) {
		this.idOpenId = idOpenId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}

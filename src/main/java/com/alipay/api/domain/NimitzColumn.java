package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Nimitz 列模型
 *
 * @author auto create
 * @since 1.0, 2022-06-13 11:05:19
 */
public class NimitzColumn extends AlipayObject {

	private static final long serialVersionUID = 6776223865965828215L;

	/**
	 * 列数据
	 */
	@ApiListField("cells")
	@ApiField("nimitz_cell")
	private List<NimitzCell> cells;

	/**
	 * 列数据类型
	 */
	@ApiField("kind")
	private String kind;

	/**
	 * 列名称
	 */
	@ApiField("name")
	private String name;

	public List<NimitzCell> getCells() {
		return this.cells;
	}
	public void setCells(List<NimitzCell> cells) {
		this.cells = cells;
	}

	public String getKind() {
		return this.kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

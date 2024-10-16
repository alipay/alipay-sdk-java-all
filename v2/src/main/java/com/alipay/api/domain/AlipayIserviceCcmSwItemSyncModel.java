package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务事项同步
 *
 * @author auto create
 * @since 1.0, 2023-06-30 16:32:15
 */
public class AlipayIserviceCcmSwItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7827688528538379512L;

	/**
	 * 云客服平台的事项库id
	 */
	@ApiField("library_id")
	private String libraryId;

	/**
	 * 具体的事项列表
	 */
	@ApiField("lists")
	private ItemGwDTO lists;

	/**
	 * 同步操作的id,  外部透传，便于记录与问题排查
	 */
	@ApiField("syn_id")
	private String synId;

	public String getLibraryId() {
		return this.libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public ItemGwDTO getLists() {
		return this.lists;
	}
	public void setLists(ItemGwDTO lists) {
		this.lists = lists;
	}

	public String getSynId() {
		return this.synId;
	}
	public void setSynId(String synId) {
		this.synId = synId;
	}

}

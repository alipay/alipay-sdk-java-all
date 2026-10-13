package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PassAccountNameHashRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passaccount.namehash.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-29 10:43:17
 */
public class AnttechOceanbasePassaccountNamehashModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6538533131479349562L;

	/** 
	 * 实际更新行数
	 */
	@ApiField("affected_rows")
	private Long affectedRows;

	/** 
	 * 是否全部通过检查
	 */
	@ApiField("can_execute")
	private Boolean canExecute;

	/** 
	 * 冲突数量
	 */
	@ApiField("conflict_count")
	private Long conflictCount;

	/** 
	 * 数据来源
	 */
	@ApiField("data_source")
	private String dataSource;

	/** 
	 * 账号处理内容
	 */
	@ApiListField("items")
	@ApiField("pass_account_name_hash_record_d_t_o")
	private List<PassAccountNameHashRecordDTO> items;

	/** 
	 * 是否预检
	 */
	@ApiField("precheck")
	private Boolean precheck;

	/** 
	 * 检查通过数量
	 */
	@ApiField("ready_count")
	private Long readyCount;

	/** 
	 * 选中数量
	 */
	@ApiField("selected_count")
	private Long selectedCount;

	/** 
	 * 快照令牌
	 */
	@ApiField("snapshot_token")
	private String snapshotToken;

	public void setAffectedRows(Long affectedRows) {
		this.affectedRows = affectedRows;
	}
	public Long getAffectedRows( ) {
		return this.affectedRows;
	}

	public void setCanExecute(Boolean canExecute) {
		this.canExecute = canExecute;
	}
	public Boolean getCanExecute( ) {
		return this.canExecute;
	}

	public void setConflictCount(Long conflictCount) {
		this.conflictCount = conflictCount;
	}
	public Long getConflictCount( ) {
		return this.conflictCount;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getDataSource( ) {
		return this.dataSource;
	}

	public void setItems(List<PassAccountNameHashRecordDTO> items) {
		this.items = items;
	}
	public List<PassAccountNameHashRecordDTO> getItems( ) {
		return this.items;
	}

	public void setPrecheck(Boolean precheck) {
		this.precheck = precheck;
	}
	public Boolean getPrecheck( ) {
		return this.precheck;
	}

	public void setReadyCount(Long readyCount) {
		this.readyCount = readyCount;
	}
	public Long getReadyCount( ) {
		return this.readyCount;
	}

	public void setSelectedCount(Long selectedCount) {
		this.selectedCount = selectedCount;
	}
	public Long getSelectedCount( ) {
		return this.selectedCount;
	}

	public void setSnapshotToken(String snapshotToken) {
		this.snapshotToken = snapshotToken;
	}
	public String getSnapshotToken( ) {
		return this.snapshotToken;
	}

}

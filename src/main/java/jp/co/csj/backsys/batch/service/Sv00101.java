/*****************************************************************************
 * プログラム ：Sv00502.java
 * 説明 ：xxxxxx.
 *****************************************************************************
 * 変更履歴： 2020.xx.xx : 新規作成
 ******************************************************************************/

package jp.co.csj.backsys.batch.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import jp.co.csj.backsys.batch.abs.AbsApiBatch;
import jp.co.csj.backsys.mapper.original.PersonMapper;
import jp.co.csj.backsys.po.original.Person;

@Service
public class Sv00101 {


	@Resource
	private PlatformTransactionManager transactionManager;


	private PersonMapper personMapper;

	private AbsApiBatch batch;

	public Sv00101(AbsApiBatch batch) throws Throwable {
		this.batch = batch;
		personMapper = (PersonMapper) batch.getApplicationContext()
				.getBean("personMapper");
	}

	/**
	 * xxxxxxx
	 * @throws Throwable
	 */

//	  @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)

	public void transfer(String name) {
		  DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
		    defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		    TransactionStatus status = transactionManager.getTransaction(defaultTransactionDefinition);


		    try {
				Person record = new Person();
				record.setName(name);
				record.setUpdatetime(new Date());
				personMapper.insert(record);
				int a=0;
				System.out.println(1/a);

		        transactionManager.commit(status);
		    } catch (Exception e) {
		        transactionManager.rollback(status);
		        e.printStackTrace();
		    }

	}
}

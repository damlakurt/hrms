package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertiseService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertiseDao;
import kodlamaio.hrms.entities.concretes.JobAdvertise;
@Service
public class JobAdvertiseManager implements JobAdvertiseService{
	private JobAdvertiseDao jobAdvertiseDao;
	
	
@Autowired
	public JobAdvertiseManager(JobAdvertiseDao jobAdvertiseDao) {
		super();
		this.jobAdvertiseDao = jobAdvertiseDao;
	}

	@Override
	public Result add(JobAdvertise jobAdvertise) {
		
		this.jobAdvertiseDao.save(jobAdvertise);
		return new SuccesResult("İş İlanı Eklendi");
		
		
	}

	@Override
	public Result delete(JobAdvertise jobAdvertise) {
		
		this.jobAdvertiseDao.delete(jobAdvertise);
		return new SuccesResult("İş İlanı Silindi");
	}

	@Override
	public Result update(JobAdvertise jobAdvertise) {
		this.jobAdvertiseDao.save(jobAdvertise);
		return new SuccesResult("İş İlanı Güncellendi");
		
	}

	@Override
	public DataResult<List<JobAdvertise>> getAll() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.findAll(), "İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> getAllByEnableTrue() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllByEnableTrue(), "Aktif İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>>getAllByEnableTrueOrderByCreatedAtDesc() {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllByEnableTrueOrderByCreatedAtDesc(), "İş İlanları Tarihe Göre Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> getAllEnableTrueByEmployer(int id) {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getAllEnableTrueByEmployer(id), " Firmanın Tüm İş İlanları Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertise>> getByIsConfirm(boolean isConfirm) {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getByIsConfirm(isConfirm));
	}

	@Override
	public DataResult<List<JobAdvertise>> getByIsConfirmAndEnable(boolean isConfirm, boolean enable) {
		return new SuccesDataResult<List<JobAdvertise>>(this.jobAdvertiseDao.getByIsConfirmAndEnable(isConfirm,enable));
	}

	
	

}

package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MetierImpl  implements IMetier {
    @Autowired
    @Qualifier("dao")
    private IDao dao;
        @Override
        public double calcul() {
            double tmp = dao.getData();
            double res = tmp * 30 / Math.atan(tmp * 2);
            return res;
        }
        public void setDao (IDao dao){
            this.dao = dao;
        }
    }




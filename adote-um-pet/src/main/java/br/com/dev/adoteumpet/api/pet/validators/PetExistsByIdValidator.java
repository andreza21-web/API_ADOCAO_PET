package br.com.dev.adoteumpet.api.pet.validators;

import br.com.dev.adoteumpet.core.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PetExistsByIdValidator implements ConstraintValidator<PetExistsById, Long> {

    @Autowired
    private PetRepository petRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return petRepository.existsById(value);
    }

}
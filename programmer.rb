class Programmer                      # No braces, use `end` instead
  attr_accessor :age                  # Symbol, Getter+Setter
  attr_reader :name, :languages       # Getters

  def initialize name                 # Define method, Constructor, Optional parentheses
    @name = name                      # Instance variable
    @languages = []                   # Array
  end

  def to_s                            # toString, No return data type
    "A programmer named #{name}, #{age} years old, knows #{languages_string}."
  end                                 # String interpolation, Optional parentheses

  private

  def languages_string
    languages.join(", ")              # Implicit return
  end
end

alice = Programmer.new('Alice')       # Object initialization
alice.age = 8                         # Invoking method age=

languages = ['Java', 'Ruby', 'Python']# Array
languages.each do |language|          # Iterate over an array
  alice.languages << language         # invoking Array#<< method
end

puts alice                            # Output

